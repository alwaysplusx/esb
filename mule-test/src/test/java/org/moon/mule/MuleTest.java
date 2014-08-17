package org.moon.mule;

public class MuleTest {

	public static void main(String[] args) throws Exception {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					org.moon.mule.EmbeddedBroker.main(null);
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(-1);
				}
			}
		}).start();
		org.mule.MuleServer.main(null);
	}

}
