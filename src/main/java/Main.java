import io.javalin.Javalin;
import java.util.*;

public class Main {

  public static void main(String[] args) {

    Javalin app = Javalin.create().start(4100);
    app.get("/", ctx -> {
      ctx.render("time.jte");
    });
    app.get("/nanoTime", ctx -> {
      ctx.render("nanoTime.jte");
    });
      
  }
}
