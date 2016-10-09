package com.example.kevintakano.a5news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AlgoritmoClick(View view)
    {
        Intent intentContent = new Intent(this,ContentActivity.class);

        intentContent.putExtra("tittle","Algoritmo");
        intentContent.putExtra("content","Um algoritmo nada mais é do que uma receita que mostra passo a passo os procedimentos necessários para a resolução de uma tarefa. Ele não responde a pergunta “o que fazer?”, mas sim “como fazer”. Em termos mais técnicos, um algoritmo é uma sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema ou executar uma tarefa.\n" +
                "\n" +
                "Embora você não perceba, utiliza algoritmos de forma intuitiva e automática diariamente quando executa tarefas comuns. Como estas atividades são simples e dispensam ficar pensando nas instruções necessárias para fazê-las, o algoritmo presente nelas acaba passando despercebido. Por exemplo, quando precisa trocar uma lâmpada, você:\n" +
                "\n" +
                " Início\n" +
                "   Verifica se o interruptor está desligado;\n" +
                "   Procura uma lâmpada nova;\n" +
                "   Pega uma escada;\n" +
                "   Leva a escada até o local;\n" +
                "   Posiciona a escada;\n" +
                "   Sobe os degraus;\n" +
                "   Para na altura apropriada;\n" +
                "   Retira a lâmpada queimada;\n" +
                "   Coloca a lâmpada nova;\n" +
                "   Desce da escada;\n" +
                "   Aciona o interruptor;\n" +
                "     Se a lâmpada não acender, então:\n" +
                "         Retira a lâmpada queimada;\n" +
                "         Coloca outra lâmpada nova\n" +
                "     Senão\n" +
                "         Tarefa terminada;\n" +
                "   Joga a lâmpada queimada no lixo;\n" +
                "  Guarda a escada;\n" +
                " Fim");

        this.startActivity(intentContent);
    }

    public void EDClick(View view)
    {
        Intent intentContent = new Intent(this,ContentActivity.class);

        intentContent.putExtra("tittle","Estruturas de Dados");
        intentContent.putExtra("content","Em Ciência da computação, uma estrutura de dados é um modo particular de armazenamento e organização de dados em um computador de modo que possam ser usados de modo eficiente. Estruturas de dados e algoritmos são temas fundamentais da Ciência da computação, sendo utilizados nas mais diversas áreas do conhecimento e com os mais diferentes propósitos de aplicação. Sabe-se que algoritmos manipulam dados. Quando estes dados estão organizados (dispostos) de forma coerente, caracterizam uma forma, uma estrutura de dados. A organização e os métodos para manipular essa estrutura é que lhe conferem singularidade.\n" +
                "\n" +
                "Podemos exemplificar os vetores ou arrays, listas encadeadas, pilhas e filas.");

        this.startActivity(intentContent);
    }


    public void LEClick(View view)
    {
        Intent intentContent = new Intent(this,ContentActivity.class);

        intentContent.putExtra("tittle","Lista de Encadeada");
        intentContent.putExtra("content","Uma Lista é uma estrutura de dados linear. Uma lista ligada, também chamada de encadeada, é linear e dinâmica, é composta por nós que apontam para o próximo elemento da lista, com exceção do último, que não aponta para ninguém. Para compor uma lista encadeada, basta guardar seu primeiro elemento.");
        intentContent.putExtra("image",1);

        this.startActivity(intentContent);
    }

    public void PILHAClick(View view)
    {
        Intent intentContent = new Intent(this,ContentActivity.class);

        intentContent.putExtra("tittle","PILHA");
        intentContent.putExtra("content","As Pilhas são estruturas baseadas no princípio LIFO (last in, first out), na qual os dados que foram inseridos por último na pilha serão os primeiros a serem removidos. Existem duas funções que se aplicam a todas as pilhas: PUSH, que insere um dado no topo da pilha, e POP, que remove o item no topo da pilha.");
        intentContent.putExtra("image",2);

        this.startActivity(intentContent);
    }

    public void FILAClick(View view)
    {
        Intent intentContent = new Intent(this,ContentActivity.class);

        intentContent.putExtra("tittle","FILA");
        intentContent.putExtra("content","As Filas são estruturas baseadas no princípio FIFO (first in, first out), em que os elementos que foram inseridos no início são os primeiros a serem removidos. Uma fila possui duas funções básicas: ENQUEUE, que adiciona um elemento ao final da fila, e DEQUEUE, que remove o elemento no início da fila. A operação DEQUEUE só pode ser aplicado se a fila não estiver vazia, causando um erro de underflow ou fila vazia se esta operação for realizada nesta situação.\n" +
                "\n");
        intentContent.putExtra("image",3);

        this.startActivity(intentContent);
    }

}
