Feature: Conference Registration & Payment

Scenario: Conference Registration
Given Launch the application browser
When  Open the web page ConferenceRegistartion.html in the browser.
Then  Verify the title 'Conference Registartion' of the page. 
Then  Click on Next without First Name
And   Verify that the message 'Please fill the First Name'
Then  Enter First Name
Then  Click on Next without Last Name
And   Verify that the message 'Please fill the Last Name'
Then  Enter Last Name
Then  Click on without Email
And   Verify that the message 'Please fill the Email'
Then  Enter Email
Then  Click next without Contact number
And   Verify that the message 'Please fill the Contact No.'
Then  Click on Next with Invalid Contact number
And   Verify that the message 'Please enter valid Contact no.'
Then  Enter Valid Contact number
Then  Click on Next without Number of people attending
And   Verify that the message 'Please fill the Number of people attending'
Then  Select Number of people attending
Then  Click on Next without Building Name & Room No
And   Verify that the message 'Please fill the Building & Room No'
Then  Enter Building Name & Room No
Then  Click on Next without Area name
And   Verify that the message 'Please fill the Area name'
Then  Enter Area name
Then  Click on Next with Select City
And   Verify that the message 'Please select city'
Then  Select City
Then  Click without State
And   Verify that the message 'Please select state'
Then  Select State
Then  Click Next without full-Access(member) or Select Conference full-Access(non-member)
And   Verify that the message 'Please Select MemeberShip status'
Then  Select Conference full-Access(member) or Select Conference full-Access(non-member)
Then  Click on the link Next
And   Verify that the message 'Personal details are validated.'
And   Verify that you are then navigated to next page PaymentDetails.html 
Then  Verify the title 'Payment Details' of the page
Then  Click on the Make Payment without Card Holder Name
And   Verify that the message 'Please fill the First Name'
Then  Enter Card Holder Name
Then  Click on the Make Payment without Card Holder LastName
And   Verify that the message 'Please fill the Last Name'
Then  Enter Card Holder LastName
Then  Click on the Make Payment without Card Number
And   Verify that the message 'Please fill the Debit card Number'
And   Enter Debit card Number
Then  Click on the Make Payment without Cvv Number
And   Verify that the message 'Please fill the CVV'
And   Enter Cvv Number
Then  Click on the Make Payment without Card expiration month
And   Verify that the message 'Please fill expiration month'
Then  Enter Card expiration month  
Then  Click on the Make Payment without Card expiration year
And   Verify that the message 'Please fill the expiration year'
Then  Enter Card expiration year
Then  Click on Make Payment button 
And   Verify that the alert box displays the message 'Registarion successful!!!'


