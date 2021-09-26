$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/ConBooking.feature");
formatter.feature({
  "name": "Conference Registration \u0026 Payment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Conference Registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the application browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.launch_the_application_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open the web page ConferenceRegistartion.html in the browser.",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.open_the_web_page_ConferenceRegistartion_html_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the title \u0027Conference Registartion\u0027 of the page.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_the_title_of_the_page(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[file:///C:/Users/admin/Desktop/ConferenceRegistartion.html]\u003e but was:\u003c[Conference Registartion]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_the_title_of_the_page(ConBookingLoginstepdefs.java:42)\r\n\tat ✽.Verify the title \u0027Conference Registartion\u0027 of the page.(file:///C:/Users/SADGHADG/OneDrive%20-%20Capgemini/Documents/WebDriverDemonew/ConBookingDemo/Features/ConBooking.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on Next without First Name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_Next_without_First_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the First Name\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter First Name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_First_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Next without Last Name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_Next_without_Last_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the Last Name\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Last Name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Last_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on without Email",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_without_Email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the Email\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Email",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click next without Contact number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_next_without_Contact_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the Contact No.\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Next with Invalid Contact number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_Next_with_Invalid_Contact_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please enter valid Contact no.\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Valid Contact number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Valid_Contact_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Next without Number of people attending",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_Next_without_Number_of_people_attending()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the Number of people attending\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Number of people attending",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.select_Number_of_people_attending()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Next without Building Name \u0026 Room No",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_Next_without_Building_Name_Room_No()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the Building \u0026 Room No\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Building Name \u0026 Room No",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Building_Name_Room_No()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Next without Area name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_Next_without_Area_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the Area name\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Area name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Area_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Next with Select City",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_Next_with_Select_City()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please select city\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select City",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.select_City()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click without State",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_without_State()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please select state\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select State",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.select_State()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Next without full-Access(member) or Select Conference full-Access(non-member)",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_Next_without_full_Access_member_or_Select_Conference_full_Access_non_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please Select MemeberShip status\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Conference full-Access(member) or Select Conference full-Access(non-member)",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.select_Conference_full_Access_member_or_Select_Conference_full_Access_non_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the link Next",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_the_link_Next()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Personal details are validated.\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that you are then navigated to next page PaymentDetails.html",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_you_are_then_navigated_to_next_page_PaymentDetails_html()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the title \u0027Payment Details\u0027 of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_the_title_of_the_page1(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Make Payment without Card Holder Name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_the_Make_Payment_without_Card_Holder_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the First Name\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Card Holder Name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Card_Holder_Name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Make Payment without Card Holder LastName",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_the_Make_Payment_without_Card_Holder_LastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the Last Name\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Card Holder LastName",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Card_Holder_LastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Make Payment without Card Number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_the_Make_Payment_without_Card_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the Debit card Number\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Debit card Number",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Debit_card_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Make Payment without Cvv Number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_the_Make_Payment_without_Cvv_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the CVV\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Cvv Number",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Cvv_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Make Payment without Card expiration month",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_the_Make_Payment_without_Card_expiration_month()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill expiration month\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Card expiration month",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Card_expiration_month()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Make Payment without Card expiration year",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_the_Make_Payment_without_Card_expiration_year()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the message \u0027Please fill the expiration year\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Card expiration year",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.enter_Card_expiration_year()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Make Payment button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.click_on_Make_Payment_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that the alert box displays the message \u0027Registarion successful!!!\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cg.project.stepdefs.ConBookingLoginstepdefs.verify_that_the_alert_box_displays_the_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});