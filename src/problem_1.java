class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addAumento(double valor) {
        this.salario += valor;
    }

    public void ganhoAnual() {
        System.out.println("\n" + this.nome);
        System.out.println("Ganho Anual: " + (this.salario * 12));
    }

    public void exibeDados() {
        this.ganhoAnual();
        System.out.println("Salario: " + this.salario);
    }


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}

class Assistente extends Funcionario {
    private int matricula;
    private String nome;
    private double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void exibeDados() {
        this.ganhoAnual();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Salario: " + this.salario);
    }

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);

        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }
}

class Tecnico extends Assistente {
    private int matricula;
    private String nome;
    private double salario;
    private double bonusSalario;

    public double getBonusSalario() {
        return bonusSalario;
    }

    public void setBonusSalario(double bonusSalario) {
        this.bonusSalario = bonusSalario;
    }

    public void ganhoAnual() {
        System.out.println("\n" + this.nome);
        System.out.println("Ganho Anual: " + ((this.salario + this.bonusSalario) * 12));
    }

    public void exibeDados() {
        this.ganhoAnual();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Salario: " + this.salario + this.bonusSalario);
    }

    public Tecnico(String nome, double salario, int matricula, double bonusSalario) {
        super(nome, salario, matricula);

        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
        this.bonusSalario = bonusSalario;
    }
}

class Administrativo extends Assistente {
    private int matricula;
    private String nome;
    private double salario;
    private String turno;

    public void ganhoAnual() {
        System.out.println("\n" + this.nome);
        if (this.turno.equals("noite")) {
             System.out.println("Ganho Anual: " + ((this.salario * 2) * 12));
             return;
        }
        System.out.println("Ganho Anual: " + (this.salario * 12));
    }

    public void exibeDados() {
        this.ganhoAnual();
        System.out.println("Matricula: " + this.matricula);
        if (this.turno.equals("noite")) {
            System.out.println("Salario: " + (this.salario * 2));
            return;
        }
        System.out.println("Salario: " + this.salario);
    }


    public Administrativo(String nome, double salario, int matricula, String turno) {
        super(nome, salario, matricula);

        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
        this.turno = turno;
    }
}