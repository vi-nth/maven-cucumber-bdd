package pageUIs.xtdt.admin;

public class PublicMapPageUI {
	public static final String SELECT_LAYER_PROJECT = "XPATH=//span[@title='%s']/parent::div/following-sibling::div//p[@title='%s']";
	public static final String DETAIL_INVEST_PROJECT = "XPATH=//span[@title='%s']//ancestor::header/following-sibling::div//div[text()='%s']";
	public static final String DETAIL_INSIDE_PROJECT = "XPATH=//span[@title='%s']/parent::div/following-sibling::div//p[@title='%s']//ancestor::li/following-sibling::div//p[text()='%s']";
	public static final String DETAIL_SIDEBAR = "XPATH=//div[text()='Chi tiết dự án']";
	public static final String IMAGE_ICON = "CSS=button>svg#Component_377_10";
	public static final String VIDEO_ICON = "CSS=button>svg#Component_379_7";
	public static final String CLOSE_ICON = "XPATH=//div[text()='Chi tiết dự án']/parent::div/button";
	public static final String DIRECTION_ICON = "XPATH=//span[@title='%s']//ancestor::header/following-sibling::div//div[text()='%s']/parent::div//div[@class='layer-object-direction']";
	public static final String START_NAME = "XPATH=//INPUT[@PLACEHOLDER='Chọn điểm đi hoặc click trên bản đồ']";
	public static final String MENU_TITLE = "XPATH=//span[text()='BẢN ĐỒ SỐ ĐẦU TƯ QUẢNG NGÃI']";
	public static final String AREA_BUTTON = "XPATH=//button[@aria-label='Danh sách lĩnh vực']";
	public static final String SELECT_AREA = "XPATH=//div[@class='layerCheckBox']//span[text()='Lĩnh vực giáo dục']";
	public static final String SEARCH_BUTTON = "XPATH=//div[@id='root']//button[@aria-label='Tìm kiếm']";
	public static final String VALUE_SEARCH = "XPATH=//label[text()='Mã dự án, tên dự án, tên chủ đầu tư, địa điểm']/parent::div/div/input";
	public static final String SEARCH_OBJECT_BUTTON = "//div[contains(@class,'btn-footer')]//button[contains(text(),'Tìm kiếm')]";

}
