$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cucumber/Features/GoogleSearch");
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Apple",
  "keyword": "Then "
});
formatter.match({
  "location": "class1.enter_Apple()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});