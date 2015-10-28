@RestController
class MyApp {

    @RequestMapping("/")
    def message() {
        return "<h1>Welcome to the Groovy World</h1>";
    }
}
