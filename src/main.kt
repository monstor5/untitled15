import java.awt.Color
import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel

fun main(){
    val window = JFrame("снеговик")
    window.setSize(800,600)
    window.contentPane = Game()

    window.isVisible = true
}


class Game : JPanel(){
    override fun paintComponent(g: Graphics) {
        g.fillRect(315,115,100,100)
        g.color = Color.BLUE
        g.fillOval(315,210,100,100)
        g.fillOval(265,305,200,200)
        g.fillOval(160,500,400,400)
        g.fillRect(40,2,10,10)
        g.color = Color.BLACK
        g.drawLine(150,220,300,430,)
        g.drawLine(300,430,150,220)
        for (i in 1..100)
            println()
    }
}










//      _______
//     /___|___\
//     |---|---|
//     \___|___/





































































































