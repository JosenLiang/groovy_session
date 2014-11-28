class App {
    String name

    public void run() {
        def display = { -> println name }

        println this
        println display.delegate

        display()
    }
}

def app = new App(name: 'Console application')
app.run()

//def show = { -> println name }
//show.delegate = new App(name: 'App instance')
//show()