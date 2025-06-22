package Aug_Ex_11082024.Real_Life_Example;

public class Firefox extends BaseClass {

        @Override
        String openBrowser(String browser) {
            System.out.println("Open the FIREFOX .....,         // This is code releted to FIREFOX only\n");
            return browser;
        }

        @Override
        String closeBrowser(String browser) {
            System.out.println("Closing the FIREFOX .....,         // This is code releted to FIREFOX only\n");
            return "";
        }
}
