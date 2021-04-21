package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static user_interface.TestTheBotPage.LBL_MODAL_ANSWER;
import static user_interface.TestTheBotPage.LBL_TEST_ANSWER;

public class Match implements Question<Boolean> {

    private String botWord;
    private String savedWord;
    private String answer;

    public Match(String answer) {
        this.answer = answer;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        botWord = Text.of(LBL_TEST_ANSWER.of(answer)).viewedBy(actor).asString();
        savedWord = Text.of(LBL_MODAL_ANSWER.of(answer)).viewedBy(actor).asString();

        return botWord.equalsIgnoreCase(savedWord);
    }

    public static Match theTexts(String answer){
        return new Match(answer);
    }
}