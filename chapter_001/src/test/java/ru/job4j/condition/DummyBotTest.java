package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Konstantin Filchenkov.
 * @version $Id$.
 * @since 14.10.2018
 */

public class DummyBotTest {
    @Test
    public void whenHiBoat() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот"), is("Привет, умник"));
    }
    @Test
    public void whenBayBoat() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока."), is("До скорой встречи."));
    }
    @Test
    public void whenaAskBoat() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Сколько будет 2+2"), is("Это ставит меня в тупик. Спросите другой вопрос."));
    }

}
