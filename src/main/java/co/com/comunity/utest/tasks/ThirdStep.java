package co.com.comunity.utest.tasks;

import co.com.comunity.utest.model.DataFormRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.comunity.utest.userinterface.JoinUtestPage.*;

public class ThirdStep implements Task {

    private List<DataFormRegister> data;

    public ThirdStep(List<DataFormRegister> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LIST_MOBILE_DEVICE));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(data.get(0).getMobileDevice()).into(TEXT_MOBILE_DEVICE));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_MOBILE_DEVICE));


        actor.attemptsTo(Click.on(LIST_MODEL));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(data.get(0).getModel()).into(TEXT_MODEL));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_MODEL));


        actor.attemptsTo(Click.on(LIST_OPERATING_SYSTEM));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(data.get(0).getModel()).into(TEXT_OPERATING_SYSTEM));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_OPERATING_SYSTEM));

        actor.attemptsTo(Click.on(BUTTON_FOURTH_STEP));

    }

    public static ThirdStep fillForm(List<DataFormRegister> data) {
        return Tasks.instrumented(ThirdStep.class, data);
    }
}
