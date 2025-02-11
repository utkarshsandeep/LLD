For lazy initialization it will check if object is null then only create the object else return
the same object.
It is not thread safe as it will create multiple objects if multiple threads are trying to get
the instance at the same time.
To overcome this we use synchronized keyword in the getInstance method.
This is very cost expensive method so we use double locking method