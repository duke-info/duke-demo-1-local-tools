module greetings {
  provides java.util.spi.ToolProvider with
      greetings.GreetToolProvider;
}
