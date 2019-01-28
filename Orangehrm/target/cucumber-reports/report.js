$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Resources/login.feature");
formatter.feature({
  "line": 3,
  "name": "log in",
  "description": "",
  "id": "log-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 8926909831,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "user should able to see login page",
  "description": "",
  "id": "log-in;user-should-able-to-see-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter valid details in login details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is able to see login page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 133795713,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userEnterValidDetailsInLoginDetails()"
});
formatter.result({
  "duration": 209767327,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnLogInButton()"
});
formatter.result({
  "duration": 1663684544,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.user_is_able_to_see_login_page()"
});
formatter.result({
  "duration": 77775189,
  "status": "passed"
});
});