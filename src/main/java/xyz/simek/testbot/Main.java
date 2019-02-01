package xyz.simek.testbot;

import com.rabidgremlin.mutters.core.Context;
import com.rabidgremlin.mutters.core.bot.BotException;
import com.rabidgremlin.mutters.core.bot.BotResponse;
import com.rabidgremlin.mutters.core.session.Session;

public class Main {
    public static void main(String[] args) throws BotException {

        Session session = new Session();
        Context context = new Context();
        TaxiInkBot taxiBot = new TaxiInkBot(new TaxiInkBotConfiguration());
        BotResponse response = taxiBot.respond(session, context, "Where is my ride ?");

//        TaxiInkBot bot = new TaxiInkBot(new TaxiInkBotConfiguration());
//        BotResponse response = bot.respond(session, context, "Order me a taxi"); // at 1323 Street");
//        System.out.println("Bot says: " + response.getResponse());
//        response = bot.respond(session, context, "136 River Road");
//        System.out.println("Bot says: " + response.getResponse());
    }
}
