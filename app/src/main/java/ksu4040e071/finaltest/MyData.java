package ksu4040e071.finaltest;


public final class MyData {
	// 以陣列儲存4個Park物件
	public static final Park[] PARKS = {
			new Park(
					"埃菲爾鐵塔",
					R.drawable.kenting,
					"與凱旋門、羅浮宮、凡爾賽宮等均為法國巴黎知名景點的艾菲爾鐵塔（Eiffel Tower,法語：La Tour Eiffel），高300米，天線高24米，總高324米，於1889年建成，矗立於法國巴黎的戰神廣場是法國文化象徵之一，得名於設計它的著名建築師、結構工程師居斯塔夫•艾菲爾 (Alexandre Gustave Eiffel)。"),
			new Park("台北捷運公館站", R.drawable.yushan,
					"公館的週邊景點，寶藏巖、自來水博物館(自來水園區)一直是十分熱門的婚紗拍攝地\n" +
							"\n" +
							"台北市水利局在今年九月，又再全新打造了包括心型拱門、藍白風車、中國囍字等浪漫指數破表的婚紗造景和裝置藝術！。"),
			new Park(
					"聖米歇爾山",
					R.drawable.yangmingshan,
					"位於諾曼第半島附近，是個離海岸約1公里遠的岩石小島，山頂有個著名的聖彌額爾山隱修院"),
			new Park("宮地嶽神社", R.drawable.taroko,
					"「宮地嶽神社」以「大注連繩」聞名，這個直徑2.6公尺、長11公尺的「大注連繩」約有3噸之重，近距離欣賞時充滿壓倒性的魄力！此外，還有大鈴與大太鼓，是一間匯集了眾多「日本第一」名物的知名神社，因此有許多人前來做新年參拜，能在此祈求生意興隆、交通安全、消災解厄、無病無災等願望。") };

	static class Park {
		private String name; // 國家公園名稱
		private int imageId; // 國家公園圖片resource id
		private String description; // 國家公園描述

		public Park() {

		}

		public Park(String name, int imageId, String description) {
			super();
			this.name = name;
			this.imageId = imageId;
			this.description = description;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getImageId() {
			return imageId;
		}

		public void setImageId(int imageId) {
			this.imageId = imageId;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}
}
