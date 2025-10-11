**CHAPTER 4 — ELASTICITY**

### **1. Hooke’s Law**

[
\text{Stress} \propto \text{Strain} \quad \text{(within elastic limit)}
]
[
\text{Stress} = E \times \text{Strain}
]
where ( E ) is the **Elastic Modulus**.

---

### **2. Young’s Modulus (Y)**

[
Y = \frac{\text{Longitudinal Stress}}{\text{Longitudinal Strain}} = \frac{F L}{A \Delta L}
]

---

### **3. Bulk Modulus (K)**

[
K = \frac{\text{Volumetric Stress}}{\text{Volumetric Strain}} = -\frac{V \Delta P}{\Delta V}
]
(The negative sign shows that pressure increase causes volume decrease.)

---

### **4. Modulus of Rigidity (G or η)**

[
G = \frac{\text{Shearing Stress}}{\text{Shearing Strain}} = \frac{F}{A \theta}
]

---

### **5. Poisson’s Ratio (σ)**

[
\sigma = \frac{\text{Lateral Strain}}{\text{Longitudinal Strain}} = \frac{\Delta D / D}{\Delta L / L}
]

---

### **6. Relation Between Elastic Constants**

[
Y = 9 K G / (3K + G)
]
and
[
Y = 2 G (1 + \sigma)
]

---

### **7. Energy Stored per Unit Volume**

[
U = \frac{1}{2} \times \text{Stress} \times \text{Strain} = \frac{1}{2} \frac{F \Delta L}{A L}
]

---

### **8. Stress–Strain Curve Laws**

* **Proportional Limit:** Hooke’s law holds.
* **Elastic Limit:** Body regains shape fully.
* **Yield Point & Breaking Point:** Plastic deformation and fracture.

---

✅ **Most-used equations in numerical parts:**

* ( F = \frac{Y A \Delta L}{L} )
* ( \Delta L = \frac{F L}{A Y} )
* ( \text{Energy density} = \frac{1}{2} \frac{\sigma^2}{Y} )

---

# 💧 **CHAPTER 5 — SURFACE TENSION**

### **1. Surface Tension**

[
T = \frac{F}{L}
]

---

### **2. Surface Energy**

[
E = T \times A
]
[
T = \frac{E}{A}
]

---

### **3. Excess Pressure in a Drop**

[
P = \frac{2T}{r}
]

---

### **4. Excess Pressure in a Soap Bubble**

[
P = \frac{4T}{r}
]

---

### **5. Work Done in Forming a Bubble**

[
W = T \times \text{increase in area}
]
[
\Rightarrow W = 8\pi r , dr , T
]

---

### **6. Total Surface Energy of Drop**

[
E = 4\pi r^2 T
]

---

### **7. When n Small Drops Combine to Form One Large Drop**

[
n \times \frac{4}{3}\pi r^3 = \frac{4}{3}\pi R^3
]
[
\Rightarrow R = n^{1/3} r
]
[
\text{Energy released} = T(4\pi n r^2 - 4\pi R^2)
]

---

### **8. Capillary Rise Law**

[
h = \frac{2T \cos \theta}{r \rho g}
]

---

✅ **Common formulas in numericals:**

* ( P = 2T/r ), ( P = 4T/r )
* ( E = 4\pi r^2 T )
* ( W = 8\pi r , dr , T )

---

# 🌊 **CHAPTER 6 — HYDRODYNAMICS**

### **1. Equation of Continuity**

[
A_1 v_1 = A_2 v_2 = \text{constant}
]
(Flow rate is constant along a streamline.)

---

### **2. Bernoulli’s Theorem**

[
P + \frac{1}{2} \rho v^2 + \rho g h = \text{constant}
]
for **steady, incompressible, non-viscous flow**.

---

### **3. Torricelli’s Theorem (Speed of Efflux)**

[
v = \sqrt{2 g h}
]
(speed of liquid coming out of a hole under gravity)

---

### **4. Venturimeter Equation**

[
v_2 = \sqrt{\frac{2(p_1 - p_2)}{\rho (1 - (A_2 / A_1)^2)}}
]

and discharge rate:
[
Q = A_2 v_2
]

---

### **5. Pitot Tube Formula**

[
v = \sqrt{2 g h}
]
(where ( h ) = difference of liquid levels in tube)

---

### **6. Equation of Flow (Continuity + Bernoulli Combined)**

[
\frac{p_1}{\rho g} + \frac{v_1^2}{2g} + h_1 = \frac{p_2}{\rho g} + \frac{v_2^2}{2g} + h_2
]

---

### **7. Application to Lift on Airplane Wing**

Pressure difference on two sides:
[
p_1 - p_2 = \frac{1}{2} \rho (v_2^2 - v_1^2)
]
Lift force:
[
F = (p_1 - p_2) A
]

---

✅ **Common equations in numericals:**

* ( v = \sqrt{2 g h} )
* ( p_1 + \frac{1}{2}\rho v_1^2 = p_2 + \frac{1}{2}\rho v_2^2 )
* ( Q = A v )

---

# 🧪 **CHAPTER 7 — VISCOSITY**

### **1. Newton’s Law of Viscous Force**

[
F = \eta A \frac{dv}{dx}
]
where

* ( \eta ) = coefficient of viscosity
* ( \frac{dv}{dx} ) = velocity gradient

---

### **2. Coefficient of Viscosity**

[
\eta = \frac{F , dx}{A , dv}
]
**Unit:** N·s/m² or Pa·s

---

### **3. Poiseuille’s Equation for Flow Through Capillary Tube**

[
V = \frac{\pi P r^4}{8 \eta l}
]
where

* ( V ) = volume per second
* ( P ) = pressure difference
* ( r ) = radius of tube
* ( l ) = length
* ( \eta ) = viscosity

---

### **4. Corrected Poiseuille’s Equation (with end correction)**

[
V = \frac{\pi P r^4}{8 \eta (l + 1.6r)}
]

---

### **5. Stoke’s Law**

[
F = 6 \pi \eta r v
]
(Viscous force on a sphere moving in liquid.)

---

### **6. Terminal Velocity (vₜ)**

At steady motion (no acceleration):
[
mg = 6 \pi \eta r v_t + \frac{4}{3}\pi r^3 \rho g
]

Solving gives:
[
v_t = \frac{2}{9} \frac{r^2 (\rho - \sigma) g}{\eta}
]

where
( \rho ) = density of sphere,
( \sigma ) = density of liquid.

---

### **7. Kinematic Viscosity**

[
\nu = \frac{\eta}{\rho}
]

---

✅ **Common numerical equations:**

* ( F = 6 \pi \eta r v )
* ( v_t = \frac{2 r^2 g (\rho - \sigma)}{9 \eta} )
* ( \eta = \frac{r^2 g (\rho - \sigma) t}{9 h} )
* ( V = \frac{\pi P r^4}{8 \eta l} )

---

# 🧾 **FINAL EXAM-READY FORMULA SHEET (All Chapters Summary)**

| Chapter         | Law                                                          | Formula                                 |
| --------------- | ------------------------------------------------------------ | --------------------------------------- |
| Elasticity      | Hooke’s Law                                                  | ( \text{Stress} \propto \text{Strain} ) |
| Elasticity      | ( Y = \frac{F L}{A \Delta L} )                               | Young’s modulus                         |
| Elasticity      | ( K = -\frac{V \Delta P}{\Delta V} )                         | Bulk modulus                            |
| Elasticity      | ( G = \frac{F}{A \theta} )                                   | Rigidity modulus                        |
| Surface Tension | ( T = \frac{F}{L} )                                          | Surface tension                         |
| Surface Tension | ( P = \frac{2T}{r} ), ( P = \frac{4T}{r} )                   | Drop, bubble                            |
| Surface Tension | ( h = \frac{2T \cos \theta}{r \rho g} )                      | Capillary rise                          |
| Hydrodynamics   | ( P + \frac{1}{2}\rho v^2 + \rho g h = \text{constant} )     | Bernoulli                               |
| Hydrodynamics   | ( A_1 v_1 = A_2 v_2 )                                        | Continuity                              |
| Hydrodynamics   | ( v = \sqrt{2 g h} )                                         | Torricelli                              |
| Hydrodynamics   | ( v_2 = \sqrt{\frac{2(p_1 - p_2)}{\rho (1 - (A_2/A_1)^2)}} ) | Venturimeter                            |
| Viscosity       | ( F = \eta A \frac{dv}{dx} )                                 | Viscous force                           |
| Viscosity       | ( F = 6 \pi \eta r v )                                       | Stoke’s law                             |
| Viscosity       | ( v_t = \frac{2r^2 g (\rho - \sigma)}{9 \eta} )              | Terminal velocity                       |
| Viscosity       | ( V = \frac{\pi P r^4}{8 \eta l} )                           | Poiseuille flow                         |
