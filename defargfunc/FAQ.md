Frequently Asked Questions
----

If you have any questions, please feel free to contact me.

#### What does this library is usefult to?

It is useful if you need function or consumer with default parameter such as it's possible in some other programming languages.

#### Any examples?

Python:

    def a(a = 1, b = 2):
            ...
C++:

    int a(int a = 1, int b = 2) 
    { 
        ...
    } 
PHP:

	function a(int $a = 1, int $b = 2) { 
		... 
	}

	a(1);
	a(1, 2)
	
JAVA [ DefargFunc ]:

	a = Consumer2DefaultParams2<Integer, Integer> consumer = registerConsumer((var a, var str) -> { ... }, 1, 2)
	a.apply(1);
	a.apply(1, 2);
	