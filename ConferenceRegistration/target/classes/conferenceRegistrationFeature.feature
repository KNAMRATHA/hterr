Feature: Conference Registration feature
Scenario: User registration for conference scenario

Given User want to register to a conference
When User launches the application browser
Then open 'ConferenceRegistration.html' web page in the browser

When user clicks on the link 'next' without entering the First Name
Then display an alert message 'Please fill the first name'

When user clicks on the link 'next' without entering the Last Name
Then display an alert message 'Please fill the last name'

When user clicks on the link 'next' without entering the Email
Then display an alert message 'Please fill the email'

When user clicks on the link 'next' with a wrong Email format
Then display an alert message 'Please enter valid email id'

When user clicks on the link 'next' without entering the ContactNo.
Then display an alert message 'Please fill the Contact No.'

When user clicks on the link 'next' with a wrong type of ContactNo.
Then display an alert message 'Please enter valid Contact No.'

When ContactNo doesnt have 10 digits
Then display an alert message 'Please enter valid Contact No.'

When user clicks on the link 'next' without selecting the number of people attending
Then display an alert message 'Number of people attending'

When user clicks on the link 'next' without entering the address
Then display an alert message 'Please fill the Building & Room No'

When user clicks on the link 'next' without entering the area
Then display an alert message 'Please fill the area name'

When user clicks on the link 'next' without selecting the city
Then display an alert message 'Please select city'

When user clicks on the link 'next' without selecting the state
Then display an alert message 'Please select state'

When user clicks on the link 'next' without selecting the membershipStatus
Then display an alert message 'Please select MemberShip status'

When User clicks on 'Next'
Then display alert message for the validity of details
And navigates to the next page 'PaymentDetails.html'

When user clicks on 'Make Payment' without entering the CardholderName
Then display an alert message 'Please fill the card holder name'

When user clicks on 'Make Payment'' without entering the DebitCardNumber
Then display an alert message 'Please fill the debit card number'

When user clicks on 'Make Payment' without entering the CardExpirationMonth
Then display an alert message 'Please fill expiration month'

When user clicks on 'Make Payment' without entering the CardExpirationYear
Then display an alert message 'Please fill expiration year'

When user clicks on 'Make Payment' button
Then display an alert message 'Conference Room Booking successfully done'
