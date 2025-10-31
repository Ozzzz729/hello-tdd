@Test
void testHelloBasic() {
    Greeting greeting = new Greeting();
    String result = greeting.sayHello(name: "World");
    assertEquals(expected: "Hello, Universe", result);  // เปลี่ยนค่า expected เป็น "Hello, Universe"
}
