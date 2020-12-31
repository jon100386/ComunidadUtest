package co.com.comunity.utest.tasks;

import co.com.comunity.utest.model.DataFormRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.comunity.utest.userinterface.JoinUtestPage.*;

public class SecondStep implements Task {

    private List<DataFormRegister> data;

    public SecondStep(List<DataFormRegister> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Click.on(TEXT_CITY));
        actor.attemptsTo(Clear.field(TEXT_CITY));
        actor.attemptsTo(Enter.keyValues(data.get(0).getCity()).into(TEXT_CITY));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Enter.keyValues(Keys.ARROW_DOWN).into(TEXT_CITY));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_CITY));


        actor.attemptsTo(Click.on(TEXT_ZIPCODE));
        actor.attemptsTo(Clear.field(TEXT_ZIPCODE));
        actor.attemptsTo(Enter.theValue(data.get(0).getZipCode()).into(TEXT_ZIPCODE));

       // actor.attemptsTo(Enter.theValue(Keys.ARROW_DOWN).into(TEXT_CITY));

        actor.attemptsTo(Click.on(BUTTON_THIRD_STEP));
    }

    public static SecondStep fillForm(List<DataFormRegister> data) {
        return Tasks.instrumented(SecondStep.class, data);
    }
}
