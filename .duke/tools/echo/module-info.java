module echo {
  provides java.util.spi.ToolProvider with
    echo.EchoToolProvider;
}
