package javaBasic;

public class Topic_14_String_Format {
	
	/**
	 * n Page = n bien locator
	 */
	public static final String CUSTOMER_INFOR_LINK = "//li[contains(@class, 'account-navigation')]/a[text()='Customer info']";
	public static final String ADDRESS_LINK = "//li[contains(@class, 'account-navigation')]/a[text()='Addresses']";
	public static final String MY_PRODUCT_REVIEW_LINK = "//li[contains(@class, 'account-navigation')]/a[text()='My product reviews']";
	public static final String REWARD_POINT_LINK = "//li[contains(@class, 'account-navigation')]/a[text()='Reward points']";
	
	/**
	 * n Page = 1 bien locator (forat giong nhau chi khac nhau boi ten page)
	 */
	public static final String DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME = "//li[contains(@class, 'account-navigation')]/a[text()='%s']";
	
	/**
	 * 1 locator dai dien cho cac Page
	 */
	public static final String DYNAMIC_LINK_BY_PAGE_NAME = "//li[contains(@class, '%s')]/a[text()='%s']";
	
	/**
	 * 1 locator co 3/4/5/6 tham so dong
	 */
	

	public static void main(String[] args) {
//		clickToLink(CUSTOMER_INFOR_LINK);
//		clickToLink(ADDRESS_LINK);
//		clickToLink(MY_PRODUCT_REVIEW_LINK);
//		clickToLink(REWARD_POINT_LINK);
		
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME,"Customer info");
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME,"Addresses");
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME,"My product reviews");
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME,"Reward points");
		
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "account-navigation", "Addresses");
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "footer-upper", "Search");
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "header-upper", "My account");
		
		
	}
	public static void clikToSidebarLink(String locator) {
		System.out.println("Click to:"+locator);	
	}
	
	/**
	 * 1 tham so dong
	 * @param dynamicLocator
	 * @param pageName
	 */
	public static void clickToLink(String dynamicLocator, String pageName) {
		String locator = String.format(dynamicLocator, pageName);
		System.out.println("Click to:"+locator);	
	}
	
	/**
	 * 2 tham so dong
	 * @param dynamicLocator
	 * @param areaName
	 * @param pageName
	 */
	public static void clickToLink(String dynamicLocator, String areaName, String pageName) {
		String locator = String.format(dynamicLocator,areaName, pageName);
		System.out.println("Click to:"+locator);	
	}
	
	/**
	 * 1-n tham so dong
	 * @param dynamicLocator
	 * @param params
	 */
	public static void clickToLink(String dynamicLocator, String...params) {
		String locator = String.format(dynamicLocator,(Object[]) params);
		System.out.println("Click to:"+locator);	
	}
	
	

}
