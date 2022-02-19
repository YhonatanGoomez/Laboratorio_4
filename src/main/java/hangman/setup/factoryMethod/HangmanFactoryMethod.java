package hangman.setup.factoryMethod;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Injector;
import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.OriginalScore;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;

import static com.google.inject.Guice.createInjector;

abstract public class HangmanFactoryMethod {
    abstract public Language createLanguage();
    abstract public HangmanDictionary createDictionary();
    abstract public HangmanPanel createHangmanPanel();
    private static Injector injector;
    private static GameScore instance = new GameScore() {
        @Override
        public int calculateScore(int correctCount, int incorrectCount) {
            return 0;
        }
    };
    private GameScore(){

        injector = createInjector(new AbstractModule() {


                                      protected void configure() {
                                          bind(GameScore.class).to(OriginalScore.class);
                                          bind(GameScore.class).to(BonusScore.class);
                                      }

                                  }

        );


    }
    private static Injector injector;
    @Inject
    private OriginalScore calculateScore;
}
