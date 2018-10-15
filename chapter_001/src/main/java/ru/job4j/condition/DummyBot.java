package ru.job4j.condition;

/**
 *@author Konstantin Filchenkov.
 *@version $Id$.
 *@since 14.10.2018
 */
public class DummyBot {
	/**
	 * bot to answer questions
	 * @param question - question from client.
	 * @since 14.10.2018.
	 */
	public String answer(String question) {
		String rs1 = "Это ставит меня в тупик. Спросите другой вопрос.";
		if ("Привет, Бот".equals(question)) {
			rs1 = "Привет, умник";
		} else if ("Пока.".equals(question)) {
			rs1 = "До скорой встречи.";
		}
		return rs1;
	}
}

