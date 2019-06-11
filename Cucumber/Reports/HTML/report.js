$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cucumber/Features/GoogleSearch.feature");
formatter.feature({
  "name": "Google search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Muhtar"
    }
  ]
});
formatter.scenario({
  "name": "simple searcg",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Muhtar"
    }
  ]
});
formatter.step({
  "name": "Enter Apple",
  "keyword": "Then "
});
formatter.match({
  "location": "class1.enter_Apple()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat Step_Definition.class1.enter_Apple(class1.java:17)\n\tat ✽.Enter Apple(Cucumber/Features/GoogleSearch.feature:6)\n",
  "status": "failed"
});
});