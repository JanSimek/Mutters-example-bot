package xyz.simek.testbot;

import com.rabidgremlin.mutters.core.Context;
import com.rabidgremlin.mutters.core.bot.BotException;
import com.rabidgremlin.mutters.core.bot.BotResponse;
import com.rabidgremlin.mutters.core.session.Session;

public class Main {
    public static void main(String[] args) throws BotException {

        TaxiInkBot bot = new TaxiInkBot(new TaxiInkBotConfiguration());
        BotResponse response = bot.respond(new Session(), new Context(), "I would like to order a cab at 1323 Street");
        System.out.println("Bot says: " + response.getResponse());
    }
}
