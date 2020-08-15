$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("casestudy2.feature");
formatter.feature({
  "line": 1,
  "name": "to register and send mail after successful validation of profile",
  "description": "",
  "id": "to-register-and-send-mail-after-successful-validation-of-profile",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "to register a user",
  "description": "",
  "id": "to-register-and-send-mail-after-successful-validation-of-profile;to-register-a-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@registration"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the website is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters mandatory details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Clicking on the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "display the valid message if registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.the_website_is_loaded()"
});
formatter.result({
  "duration": 18295809600,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.user_enters_mandatory_details()"
});
formatter.result({
  "duration": 7354968800,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.clicking_on_the_Register_button()"
});
formatter.result({
  "duration": 2853692400,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.display_the_valid_message_if_registered_successfully()"
});
formatter.result({
  "duration": 4037548200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "to validate name and email",
  "description": "",
  "id": "to-register-and-send-mail-after-successful-validation-of-profile;to-validate-name-and-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@profilevalidation"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user registered successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "clicked on profile dropdown at top right corner",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "display profile details such as name and email",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "validate name and email of the user",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.user_registered_successfully()"
});
formatter.result({
  "duration": 87100,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.clicked_on_profile_dropdown_at_top_right_corner()"
});
formatter.result({
  "duration": 3149801100,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.display_profile_details_such_as_name_and_email()"
});
formatter.result({
  "duration": 94400,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.validate_name_and_email_of_the_user()"
});
formatter.result({
  "duration": 15502625100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "to check user is able to send email",
  "description": "",
  "id": "to-register-and-send-mail-after-successful-validation-of-profile;to-check-user-is-able-to-send-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@email"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user wants to send a message to other user",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "subject is entered",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "message should be entered",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "mail should be sent",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.user_wants_to_send_a_message_to_other_user()"
});
formatter.result({
  "duration": 1631316900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.subject_is_entered()"
});
formatter.result({
  "duration": 622488000,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.message_should_be_entered()"
});
formatter.result({
  "duration": 11829235300,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.mail_should_be_sent()"
});
formatter.result({
  "duration": 2368041800,
  "status": "passed"
});
});