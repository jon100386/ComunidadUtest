package co.com.comunity.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.comunity.utest.userinterface.JoinUtestPage.LABEL_VALIDATE_REGISTER;

public class TheTitle implements Question<Boolean> {

    private String title;

    public TheTitle(String title) {
        this.title = title;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String titlePage = Text.of(LABEL_VALIDATE_REGISTER).viewedBy(actor).asString();
        if(title.equals(titlePage)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public static TheTitle is(String textCompleteRegister) {
        return new TheTitle(textCompleteRegister);
    }
}
