package Aug_Ex_11082024.Real_Life_Example;

public class Chrome extends BaseClass{

        @Override
        String openBrowser(String browser) {
            System.out.println("Open the Chrome .....,         // This is code releted to chrome only\n");
            return browser;
        }

        @Override
        String closeBrowser(String browser) {
            return "";
        }
}
