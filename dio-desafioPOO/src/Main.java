import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java básico");
        curso1.setCargaHoraria(9);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso HTML");
        curso2.setDescricao("HTML básico");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Auxílio");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Cursos de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devBeatriz = new Dev();
        devBeatriz.setNome("Beatriz");
        devBeatriz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Beatriz: " + devBeatriz.getConteudosInscritos());
        devBeatriz.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Beatriz: " + devBeatriz.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Beatriz: " + devBeatriz.getConteudosConcluidos());

        System.out.println("----------------------------------------");

        Dev devRafa = new Dev();
        devRafa.setNome("Rafael");
        devRafa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Rafael: " + devRafa.getConteudosInscritos());
        devRafa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Rafael: " + devRafa.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Rafael: " + devBeatriz.getConteudosConcluidos());
    }
}
