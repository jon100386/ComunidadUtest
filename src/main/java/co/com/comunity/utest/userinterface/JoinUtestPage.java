package co.com.comunity.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinUtestPage {

    public static final Target JOIN_TODAY = Target.the("access to the first form").located(By.partialLinkText("Join Today"));
    public static final Target TEXT_FIRST_NAME = Target.the("Text first name").located(By.id("firstName"));
    public static final Target TEXT_SECOND_NAME = Target.the("Text second name").located(By.id("lastName"));
    public static final Target TEXT_EMAIL = Target.the("Text email").located(By.id("email"));
    public static final Target LIST_MONTH = Target.the("List month").located(By.id("birthMonth"));
    public static final Target LIST_DAY = Target.the("List day").located(By.id("birthDay"));
    public static final Target LIST_YEAR = Target.the("List year").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_STEP = Target.the("Button next step").located(By.xpath("//a[@aria-label='Next step - define your location']"));
    public static final Target TEXT_CITY = Target.the("Text city").located(By.id("city"));
    public static final Target TEXT_ZIPCODE = Target.the("Text zip code").located(By.id("zip"));
    public static final Target BUTTON_THIRD_STEP = Target.the("Button third step").located(By.xpath("//a[@aria-label='Next step - select your devices']"));
    public static final Target LIST_MOBILE_DEVICE = Target.the("List mobile device").located(By.name("handsetMakerId"));
    public static final Target TEXT_MOBILE_DEVICE = Target.the("Text mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target LIST_MODEL = Target.the("List model").located(By.name("handsetModelId"));
    public static final Target TEXT_MODEL = Target.the("Text model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target LIST_OPERATING_SYSTEM = Target.the("List operating system").located(By.name("handsetOSId"));
    public static final Target TEXT_OPERATING_SYSTEM = Target.the("Text operating system").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_FOURTH_STEP = Target.the("Button fourth step").located(By.xpath("//a[@aria-label='Next - final step']"));
    public static final Target TEXT_PASSWORD = Target.the("Text password").located(By.id("password"));
    public static final Target TEXT_CONFIRM_PASSWORD = Target.the("Text confirm password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERM = Target.the("Checkbox term").located(By.id("termOfUse"));
    public static final Target CHECKBOX_POLICY_PRIVACY = Target.the("Checkbox policy and privacy").located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE_REGISTER = Target.the("Button complete register").located(By.xpath("//a[@aria-label='Complete Setup']"));
    public static final Target LABEL_VALIDATE_REGISTER = Target.the("Label validate register").located(By.xpath("//h1"));





}
