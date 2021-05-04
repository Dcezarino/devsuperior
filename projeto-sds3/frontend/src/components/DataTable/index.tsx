
const DataTable = () => {
    return (
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Vendedor</th>
                        <th>Clientes visitados</th>
                        <th>Negócios fechados</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>22/04/2021</td>
                        <td>Barry Allen</td>
                        <td>34</td>
                        <td>25</td>
                        <td>15017.00</td>
                    </tr>
                    <tr>
                        <td>01/05/2021</td>
                        <td>Ray Disney</td>
                        <td>25</td>
                        <td>32</td>
                        <td>18025.43</td>
                    </tr>
                    <tr>
                        <td>21/04/2021</td>
                        <td>Willians Fantasy</td>
                        <td>58</td>
                        <td>13</td>
                        <td>25019.35</td>
                    </tr>
                    <tr>
                        <td>18/04/2021</td>
                        <td>Melody Star</td>
                        <td>41</td>
                        <td>50</td>
                        <td>35025.12</td>
                    </tr>
                    <tr>
                        <td>04/04/2021</td>
                        <td>Mary Katy</td>
                        <td>53</td>
                        <td>22</td>
                        <td>40014.10</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

export default DataTable;