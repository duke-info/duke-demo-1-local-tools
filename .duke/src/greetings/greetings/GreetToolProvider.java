package greetings;

import java.io.PrintWriter;
import java.util.spi.ToolProvider;

public record GreetToolProvider(String name) implements ToolProvider {
  public GreetToolProvider() {
    this("greet");
  }

  @Override
  public int run(PrintWriter out, PrintWriter err, String... args) {
    out.println("Greetings!");
    return 0;
  }
}
