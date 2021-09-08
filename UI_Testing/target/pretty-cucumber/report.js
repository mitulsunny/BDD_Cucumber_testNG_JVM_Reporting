$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/osa/features/Login.feature");
formatter.feature({
  "name": "Title of your feature. I want to use this template for my feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I should be able to login in OSA Forum by using valid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@QA"
    }
  ]
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I nevigate to \"https://www.osaconsultingtech.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_nevigate_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Forum button",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_click_on_Forum_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that I am on student page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_verify_that_I_am_on_student_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the page",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_close_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I should be able to navigate to Inteview question page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@QA"
    }
  ]
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I nevigate to \"https://www.osaconsultingtech.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_nevigate_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on OSA Forum button",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_click_on_OSA_Forum_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my username",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_enter_my_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my password",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_enter_my_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on OSA login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_click_on_OSA_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on inteview Question button",
  "keyword": "When "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_click_on_inteview_Question_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that I am on interview question page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_verify_that_I_am_on_interview_question_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the page",
  "keyword": "And "
});
formatter.match({
  "location": "com.osa.steps.Steps.i_close_the_page()"
});
formatter.result({
  "status": "passed"
});
});