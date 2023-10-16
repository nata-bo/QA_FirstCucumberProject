Feature: To rent car

      @rent
      Scenario: Login with valid data
         Given User launches ChromeBrowser
         When User opens ilcarro Home page
         And User clicks on Let the car work link
         And User fills out the form
         And User clicks on the button Submit
         Then User verifies car added for rent
         And User quites browser