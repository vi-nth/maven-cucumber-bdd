package pageUIs.noiKhu;

public class ConfiguationPageUI {
	public static final String ADD_FOLDER = "XPATH=//a[@id='addFolder']";
	public static final String FOLDER_TEXTBOX = "XPATH=//input[@id='nameFolder']";
	public static final String SAVE_FOLDER_BUTTON = "XPATH=//div//button[@id='btnSaveFolder']";
	public static final String FOLDER_SUCCESSFULL_MESSAGE = "XPATH=//div[@class='toast-bottom-center']//div[text()='Thêm thư mục thành công!']";
	public static final String SEARCH_FOLDER = "XPATH=//input[@placeholder='Nhập tên lớp dữ liệu']";
	public static final String ADD_LAYER = "XPATH=//a[@id='addLayer']";
	public static final String LAYER_TEXTBOX = "XPATH=//input[@id='nameLayer']";
	public static final String SAVE_LAYER_BUTTON = "XPATH=//button[@id='btnSaveFolderLayer']";
	public static final String SAVE_ARCGIS_BUTTON = "XPATH=//button[@id='btnSavePropertiesArcgis']";
	public static final String LAYER_SUCCESSFULL_MESSAGE = "XPATH=//div[@class='toast-message' and text()='Thêm lớp dữ liệu thành công']";
	public static final String PROPERTY_BUTTON = "XPATH=//button[@class='AddRow btn ButtonRow']/span[text()='Thêm thuộc tính']";
	public static final String COLUMN_INDEX_BY_NAME = "XPATH=//div[@id='collapseTwo']//th[text()='Tên hiển thị']/preceding-sibling::th";
	public static final String CLICK_TEXTBOX_BY_COLUMN_INDEX_AND_ROW_INDEX ="XPATH=//div[@id='collapseTwo']//tr[%s]/td[%s]//div[@class='editinput']";
	public static final String INPUT_TEXTBOX_BY_COLUMN_INDEX_AND_ROW_INDEX ="XPATH=//div[@id='collapseTwo']//tr[4]/td[1]//div[@class='editinput']/following-sibling::input";
	public static final String SELECT_ITEM_BY_COLUMN_INDEX_AND_ROW_INDEX ="XPATH=//div[@id='collapseTwo']//tr[4]/td[3]//div[@class='editinput']/following-sibling::select";
	public static final String CHECK_BY_COLUMN_INDEX_AND_ROW_INDEX ="XPATH=//div[@id='collapseTwo']//tr[4]/td[5]/input[@type='checkbox']";
	public static final String SYNC_ICON ="CSS=div#Modal-layer g#đồng_bộ_dữ_liệu";
	public static final String SUCCESSFUL_MESS_SYNC="XPATH=//div[text()='Đồng bộ thành công']";
	
	public static final String TREEVIEW="XPATH=//div[@id='ArcGisSelect']//span[contains(text(),'Chọn lớp ArcGis')]/parent::button";
	public static final String SUB_TREEVIEW="XPATH=//div[@id='ArcGisSelect']//a[contains(text(),'Chọn lớp ArcGis')]/span";
	public static final String FOLDER_TREEVIEW="XPATH=//div[@id='ArcGisSelect']//a[contains(text(),'Chọn lớp ArcGis')]/span/parent::a/following-sibling::ul//a[contains(text(),'evn')]/span";
	public static final String ITEM_TREEVIEW="XPATH=//div[@id='ArcGisSelect']//a[contains(text(),'Chọn lớp ArcGis')]/span/parent::a/following-sibling::ul//a[contains(text(),'evn')]/span/parent::a/following-sibling::ul/li/a[text()='%s']";
	
	public static final String NVBAR_SIDEBAR="XPATH=//div[@id='navbarSidebar']//span[contains(text(),'%s')]";

	
	public static final String SELECT_PROPERTY_IN_ARCGIS_LAYER="XPATH=//select[@data-id='Name']";
	public static final String NAME_FOLDER_ITEM="XPATH=//span[contains(text(),'%s') and @class='name-layer-item']";
	
	public static final String CONFIG_BUTTON="XPATH=//a[@data-original-title='Cấu hình dữ liệu']";
	public static final String CHECK_ON_CONFIG_CHECKBOX="XPATH=//label[text()='%s']/preceding-sibling::div//span";
	public static final String BUTTON_ON_SAVE_PROPERTIES="XPATH=//div[@class='tab-pane fade show active']//button[contains(@class,'btn-save-properties')]";
	public static final String SUCCESSFUL_CONFIGURATION_MESSAGE_DISPLAYE="XPATH=//div[@class='toast-message']";
	
	public static final String FATHER_FOLDER="XPATH=//div[@id='LayerTreeView']/button";
	public static final String MAIN_FOLDER="XPATH=//a[text()='IOTLINK']/span";
	public static final String CHOOSE_NEW_FOLDER="XPATH=//a[text()='IOTLINK']/following-sibling::ul//li/a[contains(text(),'Lớp Demo sản phẩm')]";
	
	public static final String SYNC_BUTTON_AT_EDIT_PAGE="XPATH=//div[@id='div2']//div[@class='div-icon div-icon-sync']";
	public static final String ARCFIS_LAYER_AT_EDIT_PAGE="XPATH=//div[@id='div2']//div[@id='ArcGisSelectDiv2']/button";
	public static final String CLICK_MAIN_LAYER_AT_EDIT_PAGE="XPATH=//div[@id='div2']//div[@id='ArcGisSelectDiv2']//ul//span";
	public static final String CLICK_ARCGIS_LAYER_AT_EDIT_PAGE="XPATH=//div[@id='div2']//div[@id='ArcGisSelectDiv2']/button/following-sibling::ul//a[text()='evn']/span";
	public static final String CHOOSE_ARCGIS_LAYER_AT_EDIT_PAGE="XPATH=//div[@id='div2']//div[@id='ArcGisSelectDiv2']/button/following-sibling::ul//a[text()='evn']/span/parent::a/following-sibling::ul/li/a[text()='%s']";
	
	public static final String CONFIG_UPDATE_BUTTON="XPATH=//div[@id='div2']//div//button[text()='Lưu']";
	public static final String CONFIGURATION_POPUP_DISPLAYED="XPATH=//div[@role='dialog']//div[text()='Thông báo']";
	public static final String CONFIRM_BUTTON="XPATH=//div[@role='dialog']//div[text()='Thông báo']//following-sibling::div/div/button[text()='Đồng ý']";
	public static final String SIDEBAR_ARCGIS_DISPLAYED="XPATH=//div[contains(@class,'PropertiesArcgisLayer') and @id='Modal-layer']";
	public static final String CONFIRMATION_UPDATE_MESSAGE_DISPLAYED="XPATH=//div[contains(@class,'PropertiesArcgisLayer') and @id='Modal-layer']";
	
	public static final String INFO_TAB="XPATH=//div[@id='modal-setting-layer']//a[text()='Thông tin']";
	public static final String ICON_FILE="xpath=//label[text()='%s']/parent::div//div/input[@type='file']";
	public static final String MODEL_TYPE="XPATH=//label[text()='Mô hình']/parent::div//span[text()='Chọn kiểu mô hình']";
	public static final String SELECT_MODEL_TYPE="XPATH=//span[contains(@class,'search--dropdown')]//input[@class='select2-search__field']";
	public static final String SELECT_SAMPLE_MODEL="xpath=//ul[@role='listbox']/li[text()='%s']";
	public static final String PROPERTY_MODEL="xpath=//label[text()='Tỉ lệ']/following-sibling::input";
	


	

	
}
