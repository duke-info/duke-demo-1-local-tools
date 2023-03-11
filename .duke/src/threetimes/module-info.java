module threetimes {
  requires greetings;
  requires run.duke;

  provides run.duke.ToolOperator with
      threetimes.ThreeTimesToolOperator;
}
