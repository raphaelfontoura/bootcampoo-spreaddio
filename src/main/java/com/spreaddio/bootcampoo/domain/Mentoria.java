package com.spreaddio.bootcampoo.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
  
  private LocalDate data;
  
  public Mentoria() {
  }

  public Mentoria(String titulo, String descricao, LocalDate data) {
    setTitulo(titulo);
    setDescricao(descricao);
    this.data = data;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
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
    Mentoria other = (Mentoria) obj;
    if (getTitulo()== null) {
      if (other.getTitulo() != null)
        return false;
    } else if (!getTitulo().equals(other.getTitulo()))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Mentoria [data=" + data + ", descricao=" + getDescricao()+ ", titulo=" + getTitulo()+ "]";
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO + 20;
  }
  
}
