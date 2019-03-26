package com.it.zoopeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.framework.state.ConnectionState;
import org.apache.curator.framework.state.ConnectionStateListener;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZKT {

	public static void main(String[] args) throws Exception {
		RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
		final CuratorFramework client = CuratorFrameworkFactory.builder().connectString("172.18.44.137:2181")
				.sessionTimeoutMs(5000).connectionTimeoutMs(5000).retryPolicy(retryPolicy).build();
		client.start();
		try {
			byte [] b = {1};
			//创建缓存
			NodeCache nodeCache = new NodeCache(client, "/zookeeper/path");
			//设置在刚开始监听时 ，是否将监听的节点放进缓存
			//当false  ， 缓存为空 和节点内容不一致 则在一开始就会触发监听
			//当true   ，开始监听时将节点内容放进缓存 ，且两者一直 则不触发监听
			nodeCache.start(true);
			//触发监听的条件是 内部判断 缓存中的值 和 节点中的值是否一致
			nodeCache.getListenable().addListener(new NodeCacheListener() {
				@Override
				public void nodeChanged() throws Exception {
					// TODO Auto-generated method stub
					System.out.println("节点发送变化==========！");
				}
			});
			
			//client.create().forPath("/zookeeper/path","111".getBytes());
			client.getConnectionStateListenable().addListener(new ConnectionStateListener() {
				@Override
				public void stateChanged(CuratorFramework curatorFramework, ConnectionState connectionState) {
					//如果连接断开
					if(connectionState == ConnectionState.LOST) {
						try {
							//从新连接zk服务 ，并且成功的情况下
							if(client.getZookeeperClient().blockUntilConnectedOrTimedOut()) {
								//做的监听触发
								System.out.println();
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
					}
					System.out.println("----2");
				}
			});
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
