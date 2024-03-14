Use this file to record your reflection on this assignment.

- What are your initial impressions of how `Inheritance` affects your programming?
    It's very cool how we can create new classes that inherit attributes and behaviors from existing ones. It makes it easier to reuse code and organize code in a more structured way.
- What worked, what didn't, what advice would you give someone taking this course in the future?
    It took me a little while to get the hang of using `super` and to make sure that I would use the `extend` feature correctly. It definitely took me a few tries at debugging it to ensure that nothing that needed to be accessed from `Building` was private and that I wasn't trying to extend `House` or `Cafe` or `Library` from the others. I originally tried to extend them in a circular manner and that didn't work. For future advice, make sure to use super and extend correctly and make sure you have all the params correctly defined. When in doubt, use public if you think you might use it or modify it in another subclass because we don't really need to use private in the "oh, we're worried about users accidentally changing this" kind of way.
