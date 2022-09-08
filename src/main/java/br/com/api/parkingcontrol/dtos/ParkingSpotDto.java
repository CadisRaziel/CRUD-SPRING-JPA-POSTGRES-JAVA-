package br.com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {
    //validação de dados

    //tem tambem:
    //@email
    //@cpf
    //@notNull
    //@notEmpty

    //NotBlank -> se o campo não é nullo e se não tem string vazia
    @NotBlank
    private String parkingSpotNumber;

    @NotBlank
    //Size -> limitando o numero de caracteres
    @Size(max = 7)
    private String licensePlateCar;

    @NotBlank
    private String bandCar;

    @NotBlank
    private String modelCar;

    @NotBlank
    private String coloCar;

    @NotBlank
    private String responsibleName;

    @NotBlank
    private String apartment;

    @NotBlank
    private String block;

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBandCar() {
        return bandCar;
    }

    public void setBandCar(String bandCar) {
        this.bandCar = bandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColoCar() {
        return coloCar;
    }

    public void setColoCar(String coloCar) {
        this.coloCar = coloCar;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
