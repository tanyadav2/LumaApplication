
Feature: Creating Account and Sign-In Luma account

  Background: User open application
    Given Open Application


  @Luma @Luma1
  Scenario: Creating Account in Luma application
    Given  Click on Create an Account
    Then   Fill Information for Create Account


  @Luma @Luma2
  Scenario: Sign-In Account with Credential
    Given   Sign In Account
