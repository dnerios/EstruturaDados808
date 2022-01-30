import java.util.*;

public class EstruturaDadosApplication {
    public static void main(String[] args) {
        //FILA - FIFO (First in first out)
        Queue<String> fgts = new ArrayDeque<>();
        fgts.add("Edy");
        fgts.add("George");
        fgts.add("Luiz");

        System.out.println(fgts);
        System.out.println("Peek: " + fgts.peek());
        System.out.println(fgts);
        System.out.println("Poll: " + fgts.poll());
        System.out.println(fgts);
        System.out.println("Peek: " + fgts.peek());
        System.out.println("Peek Last: " + ((ArrayDeque<String>) fgts).peekLast());

        //Tamanho da fila
        fgts.size();

        //Remover com base em condição
        fgts.removeIf(x -> x == "Luiz");
        System.out.println(fgts);

        System.out.println(fgts.contains("George"));

        //
        System.out.println("Encerrou atendimento!");
        fgts.clear();
        System.out.println(fgts);


        //PILHA - LIFO (Last in first out)
        Stack<String> louca = new Stack<>();
        louca.push("Talheres");
        louca.push("Pratos");
        louca.push("Copos");

        System.out.println(louca);
        System.out.println(louca.peek());

        System.out.println(louca.pop());
        System.out.println(louca);

        louca.clear();

        System.out.println(louca.isEmpty());

        Stack<String> pia = (Stack<String>) louca.clone();

        LinkedList<String> linkedList = new LinkedList<>(List.of("Jogar CS","Dormir","Trabalhar"));
        linkedList.push("Corrida");
        System.out.println(linkedList.poll());

        linkedList.addLast("Assistir F1");
        linkedList.add("Elemento");

        System.out.println(linkedList);
    }
}
