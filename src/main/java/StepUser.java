import Model.LoginRequestModel;

public class StepUser {

    ApiUser apiUser = new ApiUser();

    public void createLogin(String login, String pass) {
        LoginRequestModel model = new LoginRequestModel(login, pass);
        apiUser.createLogin(model);
    }

}