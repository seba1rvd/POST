import org.testng.annotations.Test;

public class TestCreateLogin {
    StepUser stepUser = new StepUser();

    @Test
    public void LoginTest() {
        stepUser.createLogin("log", "pass");
    }
}