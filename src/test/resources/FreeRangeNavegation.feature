@Navigation
Feature: Navigation bar
 To see the subpages
 Without logging in
 I can click the navigation bar links

  Background: I am on the free range testers web without loggin in
    Given I navigate to www.freerangetesters.com

    Scenario Outline: I can access the subpages through the navigation bar 
      When I go to <section> using the navigation bar
      Examples:
          | section |
          | Cursos  |
          | Recursos  |
          | Udemy  |
          | Mentorías  |
          | Blog  |
          | Academia  |

    Scenario: Courses are presented correctly to potential customers
      When I go to Cursos using the navigation bar

    @Plans
    Scenario: Checkout options are ok
      When The client go to select plan web
      Then The client can validate the options in the checkout options