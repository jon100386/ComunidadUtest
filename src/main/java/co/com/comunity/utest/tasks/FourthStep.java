package co.com.comunity.utest.tasks;

import co.com.comunity.utest.model.DataFormRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.comunity.utest.userinterface.JoinUtestPage.*;

public class FourthStep implements Task {

    private List<DataFormRegister> data;

    public FourthStep(List<DataFormRegister> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(TEXT_PASSWORD));
        actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(TEXT_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(CHECKBOX_TERM));
        actor.attemptsTo(Click.on(CHECKBOX_POLICY_PRIVACY));
        actor.attemptsTo(Click.on(BUTTON_COMPLETE_REGISTER));
    }

    public static FourthStep fillForm(List<DataFormRegister> data) {
        return Tasks.instrumented(FourthStep.class, data);
    }
}
