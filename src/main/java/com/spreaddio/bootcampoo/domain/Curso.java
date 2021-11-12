package com.spreaddio.bootcampoo.domain;

public class Curso extends Conteudo{

  private int cargaHoraria;

  public Curso(){ }

  public Curso(String titulo, String descricao, int cargaHoraria) {
    super();
    setTitulo(titulo);
    setDescricao(descricao);
    this.cargaHoraria = cargaHoraria;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }
  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + cargaHoraria;
    result = prime * result + ((getTitulo() == null) ? 0 : getTitulo().hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Curso other = (Curso) obj;
    if (cargaHoraria != other.cargaHoraria)
      return false;
    if (getTitulo() == null) {
      if (other.getTitulo() != null)
        return false;
    } else if (!getTitulo().equals(other.getTitulo()))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Curso [cargaHoraria=" + cargaHoraria + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * this.cargaHoraria;
  }

  
}
